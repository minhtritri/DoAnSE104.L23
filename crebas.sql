/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2005                    */
/* Created on:     5/16/2021 3:29:54 PM                         */
/*==============================================================*/


if exists (select 1
            from  sysobjects
           where  id = object_id('NHACUNGCAP')
            and   type = 'U')
   drop table NHACUNGCAP
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PHIEUBANHANG')
            and   type = 'U')
   drop table PHIEUBANHANG
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PHIEUMUAHANG')
            and   type = 'U')
   drop table PHIEUMUAHANG
go

/*==============================================================*/
/* Table: NHACUNGCAP                                            */
/*==============================================================*/
create table NHACUNGCAP (
   MANCC                char(10)             not null,
   TENNCC               varchar(50)          null,
   DIACHI               varchar(50)          null,
   DIENTHOAI            int                  null,
   constraint PK_NHACUNGCAP primary key nonclustered (MANCC)
)
go

/*==============================================================*/
/* Table: PHIEUBANHANG                                          */
/*==============================================================*/
create table PHIEUBANHANG (
   MABH                 char(10)             not null,
   MAKH                 char(4)              null,
   MANV                 char(4)              null,
   MATHUOC              char(10)             null,
   SL                   int                  null,
   TONGGT               money                null,
   NGAYBAN              datetime             null,
   constraint PK_PHIEUBANHANG primary key nonclustered (MABH)
)
go

/*==============================================================*/
/* Table: PHIEUMUAHANG                                          */
/*==============================================================*/
create table PHIEUMUAHANG (
   MAMH                 char(10)             not null,
   MATHUOC              char(10)             null,
   MANV                 char(4)              null,
   MANCC                char(10)             null,
   SL                   int                  null,
   TONGGT               money                null,
   NGAYMUA              datetime             null,
   constraint PK_PHIEUMUAHANG primary key nonclustered (MAMH)
)
go

