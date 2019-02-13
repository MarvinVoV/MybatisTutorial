
package com.marvin.mybatis.tutorial.mappers;

import com.marvin.mybatis.tutorial.entity.Student;

import java.util.List;

/**
 * @author hufeng
 * @version $Id: StudentMapper.java, v 0.1 2019年02月13日 17:39 hufeng Exp $
 */
public interface StudentMapper {

    int insert(Student student);

    int update(Student student);

    int deleteById(int id);

    List<Student> getAll();

    Student getById();


}