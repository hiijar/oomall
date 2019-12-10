package xmu.oomall.discount.controller;/*
package和import根据项目具体实现
 */

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xmu.oomall.domain.user.Address;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 管理员和用户收货地址服务
 */
@RestController
@RequestMapping("")
@Validated
public interface AddressController {

	/**
	 * 用户收货地址列表
	 *
	 * @param userId 用户ID
	 * @return 收货地址列表
	 */
	@GetMapping("/addresses")
	public List<Address> list(Integer userId) ;

	/**
	 * 收货地址详情
	 *
	 * @param userId 用户ID
	 * @param id     收货地址ID
	 * @return 收货地址详情
	 */
	@GetMapping("/addresses/{id}")
	public Address detail(Integer userId, Integer id) ;

	/**
	 * 测试地址是否合法，比如是否有country/province等
	 * 用int作为返回值表示成功与否
	 */
	private int validate(Address address) ;

	/**
	 * 添加或更新收货地址
	 *
	 * @param userId  用户ID
	 * @param address 用户收货地址
	 * @return 添加或更新操作结果
	 */
	@PostMapping("/addresses")
	public Address save(Integer userId,  Address address) ;

	/**
	 * 删除收货地址
	 *
	 * @param userId  用户ID
	 * @param address 用户收货地址，{ id: xxx }
	 * @return 删除操作结果
	 */
	@DeleteMapping("/address/{id}")
	//这里用int表示删除操作成功与否
	public int delete( Integer userId, Address address, Integer id) ;


	@PutMapping("/addresses/{id}")
	public Address update( Integer userId,  Address address, Integer id) ;

	/**
	 * 管理员获取地址列表
	 *
	 * @param id 用户id
	 * @param name 用户名
	 * @return 用户的地址列表
	 */

	@GetMapping("/addresses")
	public List<Address> addressList(Integer id,  String name);
}