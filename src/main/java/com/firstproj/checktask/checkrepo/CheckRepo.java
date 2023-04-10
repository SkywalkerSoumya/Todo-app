package com.firstproj.checktask.checkrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproj.checktask.checkmodel.CheckModel;

public interface CheckRepo extends JpaRepository<CheckModel, Long> {

}
