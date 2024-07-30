package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.statementsWithTempTables;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class statementsWithTempTables.
 * @see com.echoes.DTO.X.statementsWithTempTables
 * @author Hibernate Tools
 */
public class statementsWithTempTablesHome {

    private static final Log log = LogFactory.getLog(X.statementsWithTempTablesHome.class);

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
    
    public void persist(statementsWithTempTables transientInstance) {
        log.debug("persisting statementsWithTempTables instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(statementsWithTempTables instance) {
        log.debug("attaching dirty statementsWithTempTables instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(statementsWithTempTables instance) {
        log.debug("attaching clean statementsWithTempTables instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(statementsWithTempTables persistentInstance) {
        log.debug("deleting statementsWithTempTables instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public statementsWithTempTables merge(statementsWithTempTables detachedInstance) {
        log.debug("merging statementsWithTempTables instance");
        try {
            statementsWithTempTables result = (statementsWithTempTables) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public statementsWithTempTables findById( com.echoes.DTO.X$statementsWithTempTablesId id) {
        log.debug("getting statementsWithTempTables instance with id: " + id);
        try {
            statementsWithTempTables instance = (statementsWithTempTables) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$statementsWithTempTables", id);
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
    
    public List findByExample(statementsWithTempTables instance) {
        log.debug("finding statementsWithTempTables instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$statementsWithTempTables")
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

