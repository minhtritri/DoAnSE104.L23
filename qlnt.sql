/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2008                    */
/* Created on:     5/14/2021 10:37:13 AM                        */
/*==============================================================*/


if exists (select 1
            from  sysobjects
           where  id = object_id('KHACHHANG')
            and   type = 'U')
   drop table KHACHHANG
go

if exists (select 1
            from  sysobjects
           where  id = object_id('NHANVIEN')
            and   type = 'U')
   drop table NHANVIEN
go

/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
create table KHACHHANG (
   MAKH                 char(4)              not null,
   HOTEN                varchar(40)          null,
   GIOITINH             varchar(3)           null,
   DiaChi
   constraint PK_KHACHHANG primary key nonclustered (MAKH)
)
go

/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN (
   MANV                 char(4)              not null,
   HOTEN                varchar(40)          null,
   NGAYSINH             datetime             null,
   GIOITINH             varchar(3)           null,
   DIACHI               varchar(50)          null,
   SDT                  varchar(20)          null,
   NGAYVL               datetime             null,
   CA			int 		     null,
   constraint PK_NHANVIEN primary key nonclustered (MANV)
)
go

