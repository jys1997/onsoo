package com.kh.onsoo.calendar.model.biz;

import java.util.List;

import com.kh.onsoo.calendar.model.dto.CalendarDto;

public interface CalendarBiz {
	
	public List<CalendarDto> selectList(String yyyyMMdd);
	public CalendarDto selectOne(int calendar_no);
	public int insert(CalendarDto dto);
	public int update(CalendarDto dto);
	public int delete(int calendar_no);
	public List<CalendarDto> calendarList(String yyyyMMdd);
	
}
