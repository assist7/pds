drop table if exists sys_init_record;

/*==============================================================*/
/* Table: sys_init_record                                       */
/*==============================================================*/
create table sys_init_record
(
   code                 varchar(100) comment '记录code',
   val                  varchar(200) comment '记录value',
   remark               varchar(500) comment '备注'
);

alter table sys_init_record comment '系统初始化记录表';


drop table if exists sts_user_setting;

/*==============================================================*/
/* Table: sts_user_setting                                      */
/*==============================================================*/
create table sts_user_setting
(
   code                 varchar(50) not null comment '设置项code',
   val                  varchar(200) comment '设置项value',
   remark               varchar(500) comment '备注'
);

alter table sts_user_setting comment '用户系统设置表';

