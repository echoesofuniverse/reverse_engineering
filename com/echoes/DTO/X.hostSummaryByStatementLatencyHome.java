package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.hostSummaryByStatementLatency;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class hostSummaryByStatementLatency.
 * @see com.echoes.DTO.X.hostSummaryByStatementLatency
 * @author Hibernate Tools
 */
public class hostSummaryByStatementLatencyHome {

    private static final Log log = LogFactory.getLog(X.hostSummaryByStatementLatencyHome.class);

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
    
    public void persist(hostSummaryByStatementLatency transientInstance) {
        log.debug("persisting hostSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(hostSummaryByStatementLatency instance) {
        log.debug("attaching dirty hostSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(hostSummaryByStatementLatency instance) {
        log.debug("attaching clean hostSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(hostSummaryByStatementLatency persistentInstance) {
        log.debug("deleting hostSummaryByStatementLatency instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public hostSummaryByStatementLatency merge(hostSummaryByStatementLatency detachedInstance) {
        log.debug("merging hostSummaryByStatementLatency instance");
        try {
            hostSummaryByStatementLatency result = (hostSummaryByStatementLatency) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public hostSummaryByStatementLatency findById( com.echoes.DTO.X$hostSummaryByStatementLatencyId id) {
        log.debug("getting hostSummaryByStatementLatency instance with id: " + id);
        try {
            hostSummaryByStatementLatency instance = (hostSummaryByStatementLatency) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$hostSummaryByStatementLatency", id);
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
    
    public List findByExample(hostSummaryByStatementLatency instance) {
        log.debug("finding hostSummaryByStatementLatency instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$hostSummaryByStatementLatency")
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

