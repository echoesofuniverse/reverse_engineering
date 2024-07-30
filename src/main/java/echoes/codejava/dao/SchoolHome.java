package echoes.codejava.dao;
// Generated 24 Jul, 2024 11:51:26 AM by Hibernate Tools 5.0.6.Final
import echoes.codejava.model.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class School.
 * @see echoesofuniverse.codejava.dao.School
 * @author Hibernate Tools
 */
@Stateless
public class SchoolHome {

	private static final Log log = LogFactory.getLog(SchoolHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(School transientInstance) {
		log.debug("persisting School instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(School persistentInstance) {
		log.debug("removing School instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public School merge(School detachedInstance) {
		log.debug("merging School instance");
		try {
			School result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public School findById(Integer id) {
		log.debug("getting School instance with id: " + id);
		try {
			School instance = entityManager.find(School.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
