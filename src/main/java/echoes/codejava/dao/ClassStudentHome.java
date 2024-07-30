package echoes.codejava.dao;
import echoes.codejava.model.*;
//Generated 24 Jul, 2024 11:51:26 AM by Hibernate Tools 5.0.6.Final
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
* Home object for domain model class ClassStudent.
* @see echoesofuniverse.codejava.dao.ClassStudent
* @author Hibernate Tools
*/
@Stateless
public class ClassStudentHome {

	private static final Log log = LogFactory.getLog(ClassStudentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClassStudent transientInstance) {
		log.debug("persisting ClassStudent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClassStudent persistentInstance) {
		log.debug("removing ClassStudent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClassStudent merge(ClassStudent detachedInstance) {
		log.debug("merging ClassStudent instance");
		try {
			ClassStudent result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClassStudent findById(long id) {
		log.debug("getting ClassStudent instance with id: " + id);
		try {
			ClassStudent instance = entityManager.find(ClassStudent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
