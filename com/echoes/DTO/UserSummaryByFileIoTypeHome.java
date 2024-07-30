package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class UserSummaryByFileIoType.
 * @see com.echoes.DTO.UserSummaryByFileIoType
 * @author Hibernate Tools
 */
public class UserSummaryByFileIoTypeHome {

	private static final Log log = LogFactory.getLog(UserSummaryByFileIoTypeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(UserSummaryByFileIoType transientInstance) {
		log.debug("persisting UserSummaryByFileIoType instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(UserSummaryByFileIoType instance) {
		log.debug("attaching dirty UserSummaryByFileIoType instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserSummaryByFileIoType instance) {
		log.debug("attaching clean UserSummaryByFileIoType instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(UserSummaryByFileIoType persistentInstance) {
		log.debug("deleting UserSummaryByFileIoType instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserSummaryByFileIoType merge(UserSummaryByFileIoType detachedInstance) {
		log.debug("merging UserSummaryByFileIoType instance");
		try {
			UserSummaryByFileIoType result = (UserSummaryByFileIoType) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserSummaryByFileIoType findById(com.echoes.DTO.UserSummaryByFileIoTypeId id) {
		log.debug("getting UserSummaryByFileIoType instance with id: " + id);
		try {
			UserSummaryByFileIoType instance = (UserSummaryByFileIoType) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.UserSummaryByFileIoType", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserSummaryByFileIoType instance) {
		log.debug("finding UserSummaryByFileIoType instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.UserSummaryByFileIoType")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
