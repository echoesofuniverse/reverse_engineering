package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.waitsByHostByLatency;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class waitsByHostByLatency.
 * @see com.echoes.DTO.X.waitsByHostByLatency
 * @author Hibernate Tools
 */
public class waitsByHostByLatencyHome {

    private static final Log log = LogFactory.getLog(X.waitsByHostByLatencyHome.class);

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
    
    public void persist(waitsByHostByLatency transientInstance) {
        log.debug("persisting waitsByHostByLatency instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(waitsByHostByLatency instance) {
        log.debug("attaching dirty waitsByHostByLatency instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(waitsByHostByLatency instance) {
        log.debug("attaching clean waitsByHostByLatency instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(waitsByHostByLatency persistentInstance) {
        log.debug("deleting waitsByHostByLatency instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public waitsByHostByLatency merge(waitsByHostByLatency detachedInstance) {
        log.debug("merging waitsByHostByLatency instance");
        try {
            waitsByHostByLatency result = (waitsByHostByLatency) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public waitsByHostByLatency findById( com.echoes.DTO.X$waitsByHostByLatencyId id) {
        log.debug("getting waitsByHostByLatency instance with id: " + id);
        try {
            waitsByHostByLatency instance = (waitsByHostByLatency) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$waitsByHostByLatency", id);
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
    
    public List findByExample(waitsByHostByLatency instance) {
        log.debug("finding waitsByHostByLatency instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$waitsByHostByLatency")
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

