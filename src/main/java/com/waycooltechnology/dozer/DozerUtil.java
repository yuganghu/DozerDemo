package com.waycooltechnology.dozer;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.waycooltechnology.dozer.domain.ClassA;
import com.waycooltechnology.dozer.domain.ClassB;

public class DozerUtil {
	public static ClassB mapper(final ClassA a) {
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-mapping.xml");
		DozerBeanMapper mapper = new DozerBeanMapper(myMappingFiles);
		return mapper.map(a, ClassB.class);
	}
}
