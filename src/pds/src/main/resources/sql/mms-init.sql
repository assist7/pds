/* 系统初始化记录表 */
drop table sys_init_record if exists;
create table sys_init_record comment '系统初始化记录表' (
	code varchar(100) not null comment '记录code',
	val varchar(200) comment '记录value',
	remark varchar(500) comment '备注'
);
create unique index sys_init_record_code_unique on sys_init_record (code);




/* 用户系统设置表 */
drop table sts_user_setting if exists;
create table sts_user_setting comment '用户系统设置表' (
	code varchar(100) not null comment '设置code',
	val varchar(200) comment '设置value',
	remark varchar(500) comment '备注'
);
create unique index sts_user_setting_code_unique on sts_user_setting (code);

insert into sts_user_setting(code, val, remark) values('LOGIN_SKIP', '0', '登录跳过，0：是；1：否');




/* 月账表 */
drop table fund_monthly_account if exists;
create table fund_monthly_account comment '月账表' (
   id                   long primary key auto_increment not null,
   year                 int(4) not null comment '年份',
   month                int(2) not null comment '月份',
   next_surplus         decimal(12,2) not null default '0' comment '上月结余',
   earning              decimal(12,2) not null default '0' comment '本月收入',
   expense              decimal(12,2) not null default '0' comment '本月支出',
   surplus              decimal(12,2) not null default '0' comment '本月结余',
   unnormal_earning     decimal(12,2) default '0' comment '非常规收入',
   unnormal_expense     decimal(12,2) default '0' comment '非常规支出',
   create_time          timestamp not null default current_timestamp comment '创建时间',
);
create unique index fund_monthly_account_month_unique on fund_monthly_account (year, month);























