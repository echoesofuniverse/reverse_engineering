package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.statementsWithSorting;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class statementsWithSorting.
 * @see com.echoes.DTO.X.statementsWithSorting
 * @author Hibernate Tools
 */
public class statementsWithSortingHome {

    private static final Log log = LogFactory.getLog(X.statementsWithSortingHome.class);

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
    
    public void persist(statementsWithSorting transientInstance) {
        log.debug("persisting statementsWithSorting instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(statementsWithSorting instance) {
        log.debug("attaching dirty statementsWithSorting instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(statementsWithSorting instance) {
        log.debug("attaching clean statementsWithSorting instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(statementsWithSorting persistentInstance) {
        log.debug("deleting statementsWithSorting instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public statementsWithSorting merge(statementsWithSorting detachedInstance) {
        log.debug("merging statementsWithSorting instance");
        try {
            statementsWithSorting result = (statementsWithSorting) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public statementsWithSorting findById( com.echoes.DTO.X$statementsWithSortingId id) {
        log.debug("getting statementsWithSorting instance with id: " + id);
        try {
            statementsWithSorting instance = (statementsWithSorting) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$statementsWithSorting", id);
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
    
    public List findByExample(statementsWithSorting instance) {
        log.debug("finding statementsWithSorting instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$statementsWithSorting")
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

