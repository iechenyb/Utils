package com.cyb.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author DHUser
 *
 */
public class DateUtil {
	private static SimpleDateFormat formatter = null;

	/**
	 * 
	 * 作者 : iechenyb<br>
	 * 方法描述: 说点啥<br>
	 * 创建时间: 2017年7月15日hj12
	 * 
	 * @param date
	 * @param model
	 *            yyyy-MM-dd HH:mm:ss.SSS
	 * @return
	 */
	public static String format(Date date, String model) {
		formatter = new SimpleDateFormat(model);
		String dateString = formatter.format(date);
		return dateString;
	}

	public static String format(String date, String model) {
		formatter = new SimpleDateFormat(model);
		String dateString = formatter.format(calendar(date).getTime());
		return dateString;
	}
    /**
     * 
     *作者 : iechenyb<br>
     *方法描述: 说点啥<br>
     *创建时间: 2017年7月15日hj12
     *@param date yyyy-MM-dd HH:mm:ss.SSS
     *@return
     */
	public static String timeToMilis(Date date) {
		formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String dateString = formatter.format(date);
		return dateString;
	}

	public static String timeToMilis() {
		return timeToMilis(new Date());
	}
    /**
     * 
     *作者 : iechenyb<br>
     *方法描述: 说点啥<br>
     *创建时间: 2017年7月15日hj12
     *@param date yyyy-MM-dd HH:mm:ss
     *@return
     */
	public static String timeToSec(Date date) {
		formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(date);
		return dateString;
	}

	public static String timeToSec() {
		return timeToSec(new Date());
	}

	public static String descTimeToSec() {
		formatter = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String dateString = formatter.format(new Date());
		return dateString;
	}

	public static Long date2long10(Date date) {
		formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(date);
		return Long.valueOf(dateString);
	}

	public static Long date2long10() {
		return Long.valueOf(date2long10(new Date()));
	}

	public static Long date2long8(Date date) {
		formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(date);
		return Long.valueOf(dateString);
	}

	public static Long date2long8() {
		return Long.valueOf(date2long8(new Date()));
	}

	public static Long date2long14(Date date) {
		formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateString = formatter.format(date);
		return Long.valueOf(dateString);
	}

	public static String date2long14() {
		return date2long14(new Date()).toString();
	}

	// date 20150202 -> 2015-02-02
	public static String date2long10(String date) {
		if (date.length() != 8 && date.length() != 14) {
			try {
				throw new Exception("参数必须为8位或者14位数字");
			} catch (Exception e) {
				e.printStackTrace();
				return "error";
			}
		}
		if (date.length() == 8) {
			date = date + "000000";
		}
		Date d = calendar(date).getTime();
		formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(d);
		return dateString;
	}

	public static Calendar calendar(String yyyymmddhhmmss) {
		yyyymmddhhmmss = yyyymmddhhmmss.replaceAll("-", "").replaceAll(":", "").replaceAll("\\\\", "").replaceAll(" ", "")
				.replace("/", "");
		if (yyyymmddhhmmss.length() != 8 && yyyymmddhhmmss.length() != 14) {
			try {
				throw new Exception("参数必须为8位或者12位数字");
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		if (yyyymmddhhmmss.length() == 8) {
			yyyymmddhhmmss = yyyymmddhhmmss + "000000";
		}
		Calendar cal = Calendar.getInstance();
		int year = Integer.valueOf(yyyymmddhhmmss.substring(0, 4));
		int month = Integer.valueOf(yyyymmddhhmmss.substring(4, 6));
		int day = Integer.valueOf(yyyymmddhhmmss.substring(6, 8));
		int hour = Integer.valueOf(yyyymmddhhmmss.substring(8, 10));
		int min = Integer.valueOf(yyyymmddhhmmss.substring(10, 12));
		int sec = Integer.valueOf(yyyymmddhhmmss.substring(12, 14));
		cal.set(year, month - 1, day, hour, min, sec);
		return cal;
	}

	public static Calendar calendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	public static boolean between(String shhmmss, String ehhmmss) {
		String day = DateUtil.date2long8(new Date()).toString(); // 20150102
		// 09:30-11:30 13:00-15:00
		Calendar mornings = DateUtil.calendar(day + shhmmss);
		Calendar morninge = DateUtil.calendar(day + ehhmmss);
		Calendar curDate = DateUtil.calendar(new Date());
		if ((curDate.after(mornings) && curDate.before(morninge))) {
			return true;
		} else {
			return false;
		}
	}

	public static Date preDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}

	public static int getWeekOfYear(Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setMinimalDaysInFirstWeek(7);
		c.setTime(date);
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	public static int getMaxWeekNumOfYear(int year) {
		Calendar c = new GregorianCalendar();
		c.set(year, Calendar.DECEMBER, 31, 23, 59, 59);
		return getWeekOfYear(c.getTime());
	}

	public static Date getFirstDayOfWeek(Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setMinimalDaysInFirstWeek(7);
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
		return c.getTime();
	}

	public static Date getLasttDayOfWeek(Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setMinimalDaysInFirstWeek(7);
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + 6); // Monday
		return c.getTime();
	}

	public static int getWeekNumber(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.setMinimalDaysInFirstWeek(7);
		calendar.setTime(date);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	public static Date nextSomeDay(Date date, int i) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, i);
		return c.getTime();
	}

	public static String str8to10(String yyyymmdd, String split) {
		return yyyymmdd.substring(0, 4) + split + yyyymmdd.substring(4, 6) + split + yyyymmdd.substring(6, 8);
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
	 * @throws ParseException
	 */
	public static int daysBetween(Date smdate, Date bdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			smdate = sdf.parse(sdf.format(smdate));
			bdate = sdf.parse(sdf.format(bdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 字符串的日期格式的计算
	 */
	public static int daysBetween(String smdate, String bdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		long between_days = 0;
		try {
			cal.setTime(sdf.parse(smdate));
			long time1 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(bdate));
			long time2 = cal.getTimeInMillis();
			between_days = (time2 - time1) / (1000 * 3600 * 24);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(String.valueOf(between_days));
	}

	public static void main(String[] args) throws ParseException {
		/*
		 * System.out.println(DateUtil.date2long10("20150603"));
		 * System.out.println(DateUtil.date2long10("20150603121212")); String
		 * str= "20150603"; String de = str.substring(0, 4)+"-"+str.substring(4,
		 * 6)+"-"+str.substring(6, 8); System.out.println(de);
		 * //System.out.println(format(new Date(), "yyyy�? MM月dd日HH时mm分ss�?"));
		 * SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 * Date d1=sdf.parse("2012-09-08 10:10:10"); Date d2=sdf.parse(
		 * "2012-09-15 00:00:00"); System.out.println(daysBetween(d1,d2));
		 * System.out.println(daysBetween("2012-09-08 10:10:10",
		 * "2012-09-15 00:00:00"));
		 * System.out.println(daysBetween("2012-09-08","2012-09-15"));
		 * System.out.println(calendar("20091231").get(Calendar.DAY_OF_YEAR));
		 */
		System.out.println(calendar("2012/02\\02"));
	}
}
