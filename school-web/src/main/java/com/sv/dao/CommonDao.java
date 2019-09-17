package com.sv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sv.entity.UserTraffic;

public interface CommonDao extends JpaRepository<UserTraffic, Long> {

}
