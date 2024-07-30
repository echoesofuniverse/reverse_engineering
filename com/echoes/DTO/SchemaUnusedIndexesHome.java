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
 * Home object for domain model class SchemaUnusedIndexes.
 * @see com.echoes.DTO.SchemaUnusedIndexes
 * @author Hibernate Tools
 */
public class SchemaUnusedIndexesHome {

	private static final Log log = LogFactory.getLog(SchemaUnusedIndexesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SchemaUnusedIndexes transientInstance) {
		log.debug("persisting SchemaUnusedIndexes instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SchemaUnusedIndexes instance) {
		log.debug("attaching dirty SchemaUnusedIndexes instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SchemaUnusedIndexes instance) {
		log.debug("attaching clean SchemaUnusedIndexes instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SchemaUnusedIndexes persistentInstance) {
		log.debug("deleting SchemaUnusedIndexes instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SchemaUnusedIndexes merge(SchemaUnusedIndexes detachedInstance) {
		log.debug("merging SchemaUnusedIndexes instance");
		try {
			SchemaUnusedIndexes result = (SchemaUnusedIndexes) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchemaUnusedIndexes findById(com.echoes.DTO.SchemaUnusedIndexesId id) {
		log.debug("getting SchemaUnusedIndexes instance with id: " + id);
		try {
			SchemaUnusedIndexes instance = (SchemaUnusedIndexes) sessionFactory.getCurrentSession()
					.get("com.echoes.DTO.SchemaUnusedIndexes", id);
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

	public List findByExample(SchemaUnusedIndexes instance) {
		log.debug("finding SchemaUnusedIndexes instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.echoes.DTO.SchemaUnusedIndexes")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
