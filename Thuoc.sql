drop table if exists THUOC;

/*==============================================================*/
/* Table: THUOC                                                 */
/*==============================================================*/
create table THUOC
(
   MATHUOC              char(10) not null,
   TENTHUOC             varchar(50),
   PHANNHOM             text,..
   PHANLOAI             text,..
   THANHPHAN            text,..
   MANCC               char(5),
   NGAYTIEPNHAN         date,
   #SOLO                 char(10),
   #NHASX                text,
   NGAYSX               date,
   HANSUDUNG            date,
   SL_DVT               text,...
   GIABAN               float(8,2),
   primary key (MATHUOC)
);
