package echoes.codejava.dao;
// Generated 24 Jul, 2024 11:51:26 AM by Hibernate Tools 5.0.6.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Class.
 * @see echoesofuniverse.codejava.dao.Class
 * @author Hibernate Tools
 */
@Stateless
public class ClassHome {

	private static final Log log = LogFactory.getLog(ClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Class transientInstance) {
		log.debug("persisting Class instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Class persistentInstance) {
		log.debug("removing Class instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Class merge(Class detachedInstance) {
		log.debug("merging Class instance");
		try {
			Class result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Class findById(int id) {
		log.debug("getting Class instance with id: " + id);
		try {
			Class instance = entityManager.find(Class.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
