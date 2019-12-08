# oomall

### 2019.12.6 更新日志

- 修复了代码中命名规范的问题（is前缀改为了be，代码注释要符合阿里规约格式的注释），通过阿里规约检查
- order_item中新增3个属性goods_id, name_with_specifications（商品名+选择的产品规格的文字）,pic_url属性，作为订单部分冗余的快照，记录下单时刻买的商品（含规格）的名称和图片
- 新增role和privilige表（管理员角色表和权限表）
- address添加一个收件人consignee属性
- admin表添加一个role_id属性，表示他的角色（为了简化查询，设定是一个管理员一个角色，一个角色多个权限）
- aftersales_service表里添加一个属性status，用来表示管理员的审核状态，0表示未审核，1表示审核通过，2表示审核拒绝
- Share_item漏加了success_num属性已补全

### 2019.12.7 更新日志

- address表删除了原本省市县的字符串，而是改成了记录省id、市id、县id，用到时到region表查
- be_shared_item表在数据库中补上了漏加的goods_id属性
- coupon在数据库中补上了漏加的status属性（表示是否被用过）
- 售后的domain代码中更新了注释描述，增加了userid字段

### 2019.12.8 更新日志

- couponRule里删除原本的discount和limit属性，改为strategy的json字符串，以满足多方式的优惠策略的实现