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
 * Home object for domain model class SchemaTableStatisticsWithBuffer.
 * @see com.echoes.DTO.SchemaTableStatisticsWithBuffer
 * @author Hibernate Tools
 */
public class SchemaTableStatisticsWithBufferHome {

	private static final Log log = LogFactory.getLog(SchemaTableStatisticsWithBufferHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SchemaTableStatisticsWithBuffer transientInstance) {
		log.debug("persisting SchemaTableStatisticsWithBuffer instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SchemaTableStatisticsWithBuffer instance) {
		log.debug("attaching dirty SchemaTableStatisticsWithBuffer instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SchemaTableStatisticsWithBuffer instance) {
		log.debug("attaching clean SchemaTableStatisticsWithBuffer instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SchemaTableStatisticsWithBuffer persistentInstance) {
		log.debug("deleting SchemaTableStatisticsWithBuffer instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SchemaTableStatisticsWithBuffer merge(SchemaTableStatisticsWithBuffer detachedInstance) {
		log.debug("merging SchemaTableStatisticsWithBuffer instance");
		try {
			SchemaTableStatisticsWithBuffer result = (SchemaTableStatisticsWithBuffer) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchemaTableStatisticsWithBuffer findById(com.echoes.DTO.SchemaTableStatisticsWithBufferId id) {
		log.debug("getting SchemaTableStatisticsWithBuffer instance with id: " + id);
		try {
			SchemaTableStatisticsWithBuffer instance = (SchemaTableStatisticsWithBuffer) sessionFactory
					.getCurrentSession().get("com.echoes.DTO.SchemaTableStatisticsWithBuffer", id);
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

	public List findByExample(SchemaTableStatisticsWithBuffer instance) {
		log.debug("finding SchemaTableStatisticsWithBuffer instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.echoes.DTO.SchemaTableStatisticsWithBuffer").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
