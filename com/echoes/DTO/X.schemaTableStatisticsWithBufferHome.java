package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.schemaTableStatisticsWithBuffer;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class schemaTableStatisticsWithBuffer.
 * @see com.echoes.DTO.X.schemaTableStatisticsWithBuffer
 * @author Hibernate Tools
 */
public class schemaTableStatisticsWithBufferHome {

    private static final Log log = LogFactory.getLog(X.schemaTableStatisticsWithBufferHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(schemaTableStatisticsWithBuffer transientInstance) {
        log.debug("persisting schemaTableStatisticsWithBuffer instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(schemaTableStatisticsWithBuffer instance) {
        log.debug("attaching dirty schemaTableStatisticsWithBuffer instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(schemaTableStatisticsWithBuffer instance) {
        log.debug("attaching clean schemaTableStatisticsWithBuffer instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(schemaTableStatisticsWithBuffer persistentInstance) {
        log.debug("deleting schemaTableStatisticsWithBuffer instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public schemaTableStatisticsWithBuffer merge(schemaTableStatisticsWithBuffer detachedInstance) {
        log.debug("merging schemaTableStatisticsWithBuffer instance");
        try {
            schemaTableStatisticsWithBuffer result = (schemaTableStatisticsWithBuffer) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public schemaTableStatisticsWithBuffer findById( com.echoes.DTO.X$schemaTableStatisticsWithBufferId id) {
        log.debug("getting schemaTableStatisticsWithBuffer instance with id: " + id);
        try {
            schemaTableStatisticsWithBuffer instance = (schemaTableStatisticsWithBuffer) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$schemaTableStatisticsWithBuffer", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(schemaTableStatisticsWithBuffer instance) {
        log.debug("finding schemaTableStatisticsWithBuffer instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$schemaTableStatisticsWithBuffer")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

