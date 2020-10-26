create table sys_resources
(
    id          int(64) auto_increment comment '主键'
        primary key,
    name        varchar(64)       not null comment '权限名称',
    url         varchar(120)      not null comment '权限路径',
    permission  varchar(120)      null,
    pid         int(64) default 0 not null comment '父id',
    create_time date              not null comment '创建时间',
    create_by   int(64)           not null comment '创建者',
    update_time date              null comment '更新时间',
    update_by   int(64)           null comment '更新者',
    remarks     varchar(120)      null comment '备注'
)
    comment '资源权限表';

INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (1, '系统管理', '', null, 0, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (2, 'OA办公', '', null, 0, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (3, 'CMS内容管理', '', null, 0, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (4, '用户管理', '/sysUserController/index', null, 1, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (5, '角色管理', '/sysRoleController/index', null, 1, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (6, '资源管理', '/sysResourcesController/index', null, 1, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (7, '请假申请', '', null, 2, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (8, '报销申请', '', null, 2, '2017-04-05', 0, '2017-04-05', null, null);
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (9, '图片上传', '', null, 3, '2017-04-05', 0, '2017-04-05', null, '测试');
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (10, '上传文件', '/sys21222', null, 3, '2017-04-06', 2, null, null, '测试');
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (11, '添加用户', '', 'user:add', 4, '2017-04-06', 2, '2017-04-06', null, '11');
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (12, '修改用户', '', 'user:update', 4, '2017-04-06', 2, '2017-04-06', null, '22');
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (13, '删除用户', '', 'user:delete', 4, '2017-04-06', 2, '2017-04-06', null, '33');
INSERT INTO `simple-mall`.sys_resources (id, name, url, permission, pid, create_time, create_by, update_time, update_by, remarks) VALUES (14, '系统监控', '/sysRoleController/index', null, 1, '2017-04-07', 0, '2017-04-07', null, null);