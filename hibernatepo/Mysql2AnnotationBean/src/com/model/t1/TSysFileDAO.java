package com.model.t1;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TSysFile entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.model.t1.TSysFile
 * @author MyEclipse Persistence Tools
 */

public class TSysFileDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TSysFileDAO.class);
	// property constants
	public static final String CONTENT = "content";
	public static final String FJNAME = "fjname";
	public static final String SIZE = "size";
	public static final String TIME = "time";
	public static final String TITLE = "title";

	public void save(TSysFile transientInstance) {
		log.debug("saving TSysFile instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TSysFile persistentInstance) {
		log.debug("deleting TSysFile instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TSysFile findById(java.lang.String id) {
		log.debug("getting TSysFile instance with id: " + id);
		try {
			TSysFile instance = (TSysFile) getSession().get(
					"com.model.t1.TSysFile", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TSysFile> findByExample(TSysFile instance) {
		log.debug("finding TSysFile instance by example");
		try {
			List<TSysFile> results = (List<TSysFile>) getSession()
					.createCriteria("com.model.t1.TSysFile").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TSysFile instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TSysFile as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TSysFile> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<TSysFile> findByFjname(Object fjname) {
		return findByProperty(FJNAME, fjname);
	}

	public List<TSysFile> findBySize(Object size) {
		return findByProperty(SIZE, size);
	}

	public List<TSysFile> findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List<TSysFile> findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findAll() {
		log.debug("finding all TSysFile instances");
		try {
			String queryString = "from TSysFile";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TSysFile merge(TSysFile detachedInstance) {
		log.debug("merging TSysFile instance");
		try {
			TSysFile result = (TSysFile) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TSysFile instance) {
		log.debug("attaching dirty TSysFile instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TSysFile instance) {
		log.debug("attaching clean TSysFile instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}