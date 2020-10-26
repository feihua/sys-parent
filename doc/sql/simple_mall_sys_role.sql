create table sys_role
(
    id          int(64) auto_increment comment '主键'
        primary key,
    name        varchar(64)  not null comment '角色名',
    create_time date         not null comment '创建时间',
    create_by   int(64)      not null comment '创建者',
    update_time date         null comment '更新时间',
    update_by   int(64)      null comment '更新者',
    remarks     varchar(120) null comment '备注'
);

INSERT INTO `simple-mall`.sys_role (id, name, create_time, create_by, update_time, update_by, remarks) VALUES (1, '超级管理员', '2017-04-06', 2, null, null, '测试1');
INSERT INTO `simple-mall`.sys_role (id, name, create_time, create_by, update_time, update_by, remarks) VALUES (2, '普通管理员', '2017-04-06', 2, null, null, '测试2');