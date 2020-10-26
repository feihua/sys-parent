create table sys_role_resources
(
    id           int(64) auto_increment comment '主键'
        primary key,
    role_id      int(64)      not null comment '角色id',
    resources_id int(64)      not null comment '资源权限id',
    create_time  datetime     not null comment '创建时间',
    create_by    int(64)      not null comment '创建者',
    update_time  datetime     null comment '更新时间',
    update_by    int(64)      null comment '更新者',
    remarks      varchar(120) null comment '备注'
);

INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (4, 2, 1, '2017-04-13 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (5, 2, 2, '2017-04-07 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (6, 2, 3, '2017-04-07 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (7, 2, 4, '2017-04-07 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (8, 2, 5, '2017-04-07 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (9, 2, 6, '2017-04-07 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (10, 2, 7, '2017-04-07 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (11, 2, 8, '2017-04-07 00:00:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (12, 2, 9, '2017-04-07 09:40:53', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (13, 2, 10, '2017-04-07 09:40:57', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (14, 2, 11, '2017-04-07 09:41:00', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (15, 2, 12, '2017-04-07 09:41:03', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (16, 2, 13, '2017-04-07 09:41:06', 0, null, null, null);
INSERT INTO `simple-mall`.sys_role_resources (id, role_id, resources_id, create_time, create_by, update_time, update_by, remarks) VALUES (17, 2, 14, '2017-04-07 09:41:08', 0, null, null, null);