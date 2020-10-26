create table sys_user
(
    id          int auto_increment comment '主键'
        primary key,
    name        varchar(64)  not null comment '用户名',
    password    varchar(120) not null comment '密码',
    age         int          null comment '年龄',
    phone       varchar(11)  null comment '手机号码',
    email       varchar(24)  null comment '邮件',
    create_time date         not null comment '创建时间',
    create_by   int(64)      not null comment '创建者',
    update_time date         null comment '更新时间',
    update_by   int(64)      null comment '更新者',
    remarks     varchar(240) null comment '备注'
)
    comment '用户信息表';

INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (1, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (2, 'admin', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-05', 0, '2017-04-05', 0, '超级管理员');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (5, 'fff', '123', 27, '18613030352', '1002219331@qq.com', '2017-04-06', 2, null, null, '测试2');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (6, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (7, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (8, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (9, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (10, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (11, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (12, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (13, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (14, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (15, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (16, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (17, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (18, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (19, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (20, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (21, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (22, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (23, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (24, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (25, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (26, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (27, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (28, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (29, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (30, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (31, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (32, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (33, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (34, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (35, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (36, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (37, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (38, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (39, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (40, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (41, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (42, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (43, 'liu', '123', 27, '13144410811', '1044300414@qq.cin', '2017-04-06', 0, '2017-04-01', 0, '1');
INSERT INTO `simple-mall`.sys_user (id, name, password, age, phone, email, create_time, create_by, update_time, update_by, remarks) VALUES (44, 'string', 'string', 0, 'string', 'string', '2020-10-15', 0, '2020-10-15', 0, 'string');