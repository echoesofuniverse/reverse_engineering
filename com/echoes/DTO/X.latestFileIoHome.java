package com.echoes.DTO;
// Generated 23 Jul, 2024 8:41:09 AM by Hibernate Tools 5.0.6.Final


import X.latestFileIo;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class latestFileIo.
 * @see com.echoes.DTO.X.latestFileIo
 * @author Hibernate Tools
 */
public class latestFileIoHome {

    private static final Log log = LogFactory.getLog(X.latestFileIoHome.class);

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
    
    public void persist(latestFileIo transientInstance) {
        log.debug("persisting latestFileIo instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(latestFileIo instance) {
        log.debug("attaching dirty latestFileIo instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(latestFileIo instance) {
        log.debug("attaching clean latestFileIo instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(latestFileIo persistentInstance) {
        log.debug("deleting latestFileIo instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public latestFileIo merge(latestFileIo detachedInstance) {
        log.debug("merging latestFileIo instance");
        try {
            latestFileIo result = (latestFileIo) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public latestFileIo findById( com.echoes.DTO.X$latestFileIoId id) {
        log.debug("getting latestFileIo instance with id: " + id);
        try {
            latestFileIo instance = (latestFileIo) sessionFactory.getCurrentSession()
                    .get("com.echoes.DTO.X$latestFileIo", id);
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
    
    public List findByExample(latestFileIo instance) {
        log.debug("finding latestFileIo instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.echoes.DTO.X$latestFileIo")
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

