package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.userSummaryByFileIo;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class userSummaryByFileIo.
 * @see com.echoes.DTO.X.userSummaryByFileIo
 * @author Hibernate Tools
 */
public class userSummaryByFileIoHome {

    private static final Log log = LogFactory.getLog(X.userSummaryByFileIoHome.class);

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
    
    public void persist(userSummaryByFileIo transientInstance) {
        log.debug("persisting userSummaryByFileIo instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(userSummaryByFileIo instance) {
        log.debug("attaching dirty userSummaryByFileIo instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(userSummaryByFileIo instance) {
        log.debug("attaching clean userSummaryByFileIo instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(userSummaryByFileIo persistentInstance) {
        log.debug("deleting userSummaryByFileIo instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public userSummaryByFileIo merge(userSummaryByFileIo detachedInstance) {
        log.debug("merging userSummaryByFileIo instance");
        try {
            userSummaryByFileIo result = (userSummaryByFileIo) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public userSummaryByFileIo findById( com.echoes.DTO.X$userSummaryByFileIoId id) {
        log.debug("getting userSummaryByFileIo instance with id: " + id);
        try {
            userSummaryByFileIo instance = (userSummaryByFileIo) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$userSummaryByFileIo", id);
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
    
    public List findByExample(userSummaryByFileIo instance) {
        log.debug("finding userSummaryByFileIo instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$userSummaryByFileIo")
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

