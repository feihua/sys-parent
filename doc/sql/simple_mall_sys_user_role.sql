create table sys_user_role
(
    id          int(64) auto_increment comment '主键'
        primary key,
    user_id     int(64)      not null comment '用户id',
    role_id     int          not null comment '角色id',
    create_time date         not null comment '创建时间',
    create_by   int(64)      not null comment '创建者',
    update_time date         null comment '更新时间',
    update_by   int(64)      null comment '更新者',
    remarks     varchar(120) null comment '备注'
);

INSERT INTO `simple-mall`.sys_user_role (id, user_id, role_id, create_time, create_by, update_time, update_by, remarks) VALUES (1, 2, 1, '2017-04-06', 0, '2017-04-06', null, '11');
INSERT INTO `simple-mall`.sys_user_role (id, user_id, role_id, create_time, create_by, update_time, update_by, remarks) VALUES (2, 2, 2, '2017-04-06', 0, '2017-04-06', null, '22');