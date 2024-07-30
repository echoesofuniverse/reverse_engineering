package echoes.codejava.dao;
// Generated 24 Jul, 2024 11:51:26 AM by Hibernate Tools 5.0.6.Final
import echoes.codejava.model.*;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Classroom.
 * @see echoesofuniverse.codejava.dao.Classroom
 * @author Hibernate Tools
 */
@Stateless
public class ClassroomHome {

	private static final Log log = LogFactory.getLog(ClassroomHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Classroom transientInstance) {
		log.debug("persisting Classroom instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Classroom persistentInstance) {
		log.debug("removing Classroom instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Classroom merge(Classroom detachedInstance) {
		log.debug("merging Classroom instance");
		try {
			Classroom result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Classroom findById(int id) {
		log.debug("getting Classroom instance with id: " + id);
		try {
			Classroom instance = entityManager.find(Classroom.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
