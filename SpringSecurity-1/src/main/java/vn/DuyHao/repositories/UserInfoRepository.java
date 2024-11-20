package vn.DuyHao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.DuyHao.Entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{
	Optional<UserInfo> findByName(String username);
}
