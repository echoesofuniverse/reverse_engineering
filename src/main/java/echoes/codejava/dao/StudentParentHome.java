package echoes.codejava.dao;
// Generated 24 Jul, 2024 11:51:26 AM by Hibernate Tools 5.0.6.Final
import echoes.codejava.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Home object for domain model class StudentParent.
 * @see echoesofuniverse.codejava.dao.StudentParent
 * @author Hibernate Tools
 */
@Stateless
public class StudentParentHome {

	private static final Log log = LogFactory.getLog(StudentParentHome.class);
    //private static final Logger logger = LoggerFactory.getLogger(StudentParentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentParent transientInstance) {
		log.debug("persisting StudentParent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentParent persistentInstance) {
		log.debug("removing StudentParent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentParent merge(StudentParent detachedInstance) {
		log.debug("merging StudentParent instance");
		try {
			StudentParent result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentParent findById(int id) {
		log.debug("getting StudentParent instance with id: " + id);
		try {
			StudentParent instance = entityManager.find(StudentParent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
