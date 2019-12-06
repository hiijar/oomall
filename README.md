# oomall

### 2019.12.6 更新日志

- 修复了代码中命名规范的问题（is前缀改为了be，代码注释要符合阿里规约格式的注释），通过阿里规约检查
- order_item中新增3个属性goods_id, name_with_specifications（商品名+选择的产品规格的文字）,pic_url属性，作为订单部分冗余的快照，记录下单时刻买的商品（含规格）的名称和图片
- 新增role和privilige表（管理员角色表和权限表）
- address添加一个收件人consignee属性
- admin表添加一个role_id属性，表示他的角色（为了简化查询，设定是一个管理员一个角色，一个角色多个权限）
- aftersales_service表里添加一个属性status，用来表示管理员的审核状态，0表示未审核，1表示审核通过，2表示审核拒绝

