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
 * Home object for domain model class StatementsWithRuntimesIn95thPercentile.
 * @see com.echoes.DTO.StatementsWithRuntimesIn95thPercentile
 * @author Hibernate Tools
 */
public class StatementsWithRuntimesIn95thPercentileHome {

	private static final Log log = LogFactory.getLog(StatementsWithRuntimesIn95thPercentileHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StatementsWithRuntimesIn95thPercentile transientInstance) {
		log.debug("persisting StatementsWithRuntimesIn95thPercentile instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StatementsWithRuntimesIn95thPercentile instance) {
		log.debug("attaching dirty StatementsWithRuntimesIn95thPercentile instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StatementsWithRuntimesIn95thPercentile instance) {
		log.debug("attaching clean StatementsWithRuntimesIn95thPercentile instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StatementsWithRuntimesIn95thPercentile persistentInstance) {
		log.debug("deleting StatementsWithRuntimesIn95thPercentile instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StatementsWithRuntimesIn95thPercentile merge(StatementsWithRuntimesIn95thPercentile detachedInstance) {
		log.debug("merging StatementsWithRuntimesIn95thPercentile instance");
		try {
			StatementsWithRuntimesIn95thPercentile result = (StatementsWithRuntimesIn95thPercentile) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StatementsWithRuntimesIn95thPercentile findById(com.echoes.DTO.StatementsWithRuntimesIn95thPercentileId id) {
		log.debug("getting StatementsWithRuntimesIn95thPercentile instance with id: " + id);
		try {
			StatementsWithRuntimesIn95thPercentile instance = (StatementsWithRuntimesIn95thPercentile) sessionFactory
					.getCurrentSession().get("com.echoes.DTO.StatementsWithRuntimesIn95thPercentile", id);
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

	public List findByExample(StatementsWithRuntimesIn95thPercentile instance) {
		log.debug("finding StatementsWithRuntimesIn95thPercentile instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.echoes.DTO.StatementsWithRuntimesIn95thPercentile")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
