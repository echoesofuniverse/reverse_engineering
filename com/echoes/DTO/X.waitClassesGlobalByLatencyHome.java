package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.waitClassesGlobalByLatency;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class waitClassesGlobalByLatency.
 * @see com.echoes.DTO.X.waitClassesGlobalByLatency
 * @author Hibernate Tools
 */
public class waitClassesGlobalByLatencyHome {

    private static final Log log = LogFactory.getLog(X.waitClassesGlobalByLatencyHome.class);

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
    
    public void persist(waitClassesGlobalByLatency transientInstance) {
        log.debug("persisting waitClassesGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(waitClassesGlobalByLatency instance) {
        log.debug("attaching dirty waitClassesGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(waitClassesGlobalByLatency instance) {
        log.debug("attaching clean waitClassesGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(waitClassesGlobalByLatency persistentInstance) {
        log.debug("deleting waitClassesGlobalByLatency instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public waitClassesGlobalByLatency merge(waitClassesGlobalByLatency detachedInstance) {
        log.debug("merging waitClassesGlobalByLatency instance");
        try {
            waitClassesGlobalByLatency result = (waitClassesGlobalByLatency) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public waitClassesGlobalByLatency findById( com.echoes.DTO.X$waitClassesGlobalByLatencyId id) {
        log.debug("getting waitClassesGlobalByLatency instance with id: " + id);
        try {
            waitClassesGlobalByLatency instance = (waitClassesGlobalByLatency) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$waitClassesGlobalByLatency", id);
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
    
    public List findByExample(waitClassesGlobalByLatency instance) {
        log.debug("finding waitClassesGlobalByLatency instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$waitClassesGlobalByLatency")
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

