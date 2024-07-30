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
 * Home object for domain model class PsCheckLostInstrumentation.
 * @see com.echoes.DTO.PsCheckLostInstrumentation
 * @author Hibernate Tools
 */
public class PsCheckLostInstrumentationHome {

	private static final Log log = LogFactory.getLog(PsCheckLostInstrumentationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(PsCheckLostInstrumentation transientInstance) {
		log.debug("persisting PsCheckLostInstrumentation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PsCheckLostInstrumentation instance) {
		log.debug("attaching dirty PsCheckLostInstrumentation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PsCheckLostInstrumentation instance) {
		log.debug("attaching clean PsCheckLostInstrumentation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PsCheckLostInstrumentation persistentInstance) {
		log.debug("deleting PsCheckLostInstrumentation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PsCheckLostInstrumentation merge(PsCheckLostInstrumentation detachedInstance) {
		log.debug("merging PsCheckLostInstrumentation instance");
		try {
			PsCheckLostInstrumentation result = (PsCheckLostInstrumentation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PsCheckLostInstrumentation findById(com.echoes.DTO.PsCheckLostInstrumentationId id) {
		log.debug("getting PsCheckLostInstrumentation instance with id: " + id);
		try {
			PsCheckLostInstrumentation instance = (PsCheckLostInstrumentation) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.PsCheckLostInstrumentation", id);
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

	public List findByExample(PsCheckLostInstrumentation instance) {
		log.debug("finding PsCheckLostInstrumentation instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.echoes.DTO.PsCheckLostInstrumentation").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
