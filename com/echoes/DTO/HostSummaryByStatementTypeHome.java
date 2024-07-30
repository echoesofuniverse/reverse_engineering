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
 * Home object for domain model class HostSummaryByStatementType.
 * @see com.echoes.DTO.HostSummaryByStatementType
 * @author Hibernate Tools
 */
public class HostSummaryByStatementTypeHome {

	private static final Log log = LogFactory.getLog(HostSummaryByStatementTypeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(HostSummaryByStatementType transientInstance) {
		log.debug("persisting HostSummaryByStatementType instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(HostSummaryByStatementType instance) {
		log.debug("attaching dirty HostSummaryByStatementType instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HostSummaryByStatementType instance) {
		log.debug("attaching clean HostSummaryByStatementType instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(HostSummaryByStatementType persistentInstance) {
		log.debug("deleting HostSummaryByStatementType instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HostSummaryByStatementType merge(HostSummaryByStatementType detachedInstance) {
		log.debug("merging HostSummaryByStatementType instance");
		try {
			HostSummaryByStatementType result = (HostSummaryByStatementType) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public HostSummaryByStatementType findById(com.echoes.DTO.HostSummaryByStatementTypeId id) {
		log.debug("getting HostSummaryByStatementType instance with id: " + id);
		try {
			HostSummaryByStatementType instance = (HostSummaryByStatementType) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.HostSummaryByStatementType", id);
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

	public List findByExample(HostSummaryByStatementType instance) {
		log.debug("finding HostSummaryByStatementType instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.echoes.DTO.HostSummaryByStatementType").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
