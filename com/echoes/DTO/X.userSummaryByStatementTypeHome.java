package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.userSummaryByStatementType;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class userSummaryByStatementType.
 * @see com.echoes.DTO.X.userSummaryByStatementType
 * @author Hibernate Tools
 */
public class userSummaryByStatementTypeHome {

    private static final Log log = LogFactory.getLog(X.userSummaryByStatementTypeHome.class);

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
    
    public void persist(userSummaryByStatementType transientInstance) {
        log.debug("persisting userSummaryByStatementType instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(userSummaryByStatementType instance) {
        log.debug("attaching dirty userSummaryByStatementType instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(userSummaryByStatementType instance) {
        log.debug("attaching clean userSummaryByStatementType instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(userSummaryByStatementType persistentInstance) {
        log.debug("deleting userSummaryByStatementType instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public userSummaryByStatementType merge(userSummaryByStatementType detachedInstance) {
        log.debug("merging userSummaryByStatementType instance");
        try {
            userSummaryByStatementType result = (userSummaryByStatementType) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public userSummaryByStatementType findById( com.echoes.DTO.X$userSummaryByStatementTypeId id) {
        log.debug("getting userSummaryByStatementType instance with id: " + id);
        try {
            userSummaryByStatementType instance = (userSummaryByStatementType) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$userSummaryByStatementType", id);
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
    
    public List findByExample(userSummaryByStatementType instance) {
        log.debug("finding userSummaryByStatementType instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$userSummaryByStatementType")
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

