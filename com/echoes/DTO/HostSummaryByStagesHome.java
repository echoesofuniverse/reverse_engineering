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
 * Home object for domain model class HostSummaryByStages.
 * @see com.echoes.DTO.HostSummaryByStages
 * @author Hibernate Tools
 */
public class HostSummaryByStagesHome {

	private static final Log log = LogFactory.getLog(HostSummaryByStagesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(HostSummaryByStages transientInstance) {
		log.debug("persisting HostSummaryByStages instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(HostSummaryByStages instance) {
		log.debug("attaching dirty HostSummaryByStages instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HostSummaryByStages instance) {
		log.debug("attaching clean HostSummaryByStages instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(HostSummaryByStages persistentInstance) {
		log.debug("deleting HostSummaryByStages instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HostSummaryByStages merge(HostSummaryByStages detachedInstance) {
		log.debug("merging HostSummaryByStages instance");
		try {
			HostSummaryByStages result = (HostSummaryByStages) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public HostSummaryByStages findById(com.echoes.DTO.HostSummaryByStagesId id) {
		log.debug("getting HostSummaryByStages instance with id: " + id);
		try {
			HostSummaryByStages instance = (HostSummaryByStages) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.HostSummaryByStages", id);
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

	public List findByExample(HostSummaryByStages instance) {
		log.debug("finding HostSummaryByStages instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.HostSummaryByStages")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
