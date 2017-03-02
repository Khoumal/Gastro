/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     01/03/2017 22:05:20                          */
/*==============================================================*/


drop index CATEGORIE_PK;

drop table CATEGORIE;

drop index SEXCLIENT_FK;

drop index CLIENT_PK;

drop table CLIENT;

drop index COMMANDECLIENT_FK;

drop index COMMANDE_PK;

drop table COMMANDE;

drop index MENU_PK;

drop table MENU;

drop index MENUPRODUIT2_FK;

drop index MENUPRODUIT_FK;

drop index MENUPRODUIT_PK;

drop table MENUPRODUIT;

drop index PRIX_PK;

drop table PRIX;

drop index CATPRODUIT_FK;

drop index PRODUIT_PK;

drop table PRODUIT;

drop index PRODUITCOMMANDE2_FK;

drop index PRODUITCOMMANDE_FK;

drop index PRODUITCOMMANDE_PK;

drop table PRODUITCOMMANDE;

drop index SEXE_PK;

drop table SEXE;

/*==============================================================*/
/* Table: CATEGORIE                                             */
/*==============================================================*/
create table CATEGORIE (
   IDCATEGORIE          SERIAL               not null,
   NOMCATEGORIE         VARCHAR(50)          null,
   constraint PK_CATEGORIE primary key (IDCATEGORIE)
);

/*==============================================================*/
/* Index: CATEGORIE_PK                                          */
/*==============================================================*/
create unique index CATEGORIE_PK on CATEGORIE (
IDCATEGORIE
);

/*==============================================================*/
/* Table: CLIENT                                                */
/*==============================================================*/
create table CLIENT (
   IDCLIENT             SERIAL               not null,
   IDSEXE               INT4                 not null,
   NOMCLIENT            VARCHAR(100)         null,
   DATENAISSANCE        DATE                 null,
   constraint PK_CLIENT primary key (IDCLIENT)
);

/*==============================================================*/
/* Index: CLIENT_PK                                             */
/*==============================================================*/
create unique index CLIENT_PK on CLIENT (
IDCLIENT
);

/*==============================================================*/
/* Index: SEXCLIENT_FK                                          */
/*==============================================================*/
create  index SEXCLIENT_FK on CLIENT (
IDSEXE
);

/*==============================================================*/
/* Table: COMMANDE                                              */
/*==============================================================*/
create table COMMANDE (
   IDCOMMANDE           SERIAL               not null,
   IDCLIENT             INT4                 not null,
   NOMCOMMANDE          VARCHAR(100)         null,
   DESCRITPIONCOM       VARCHAR(250)         null,
   constraint PK_COMMANDE primary key (IDCOMMANDE)
);

/*==============================================================*/
/* Index: COMMANDE_PK                                           */
/*==============================================================*/
create unique index COMMANDE_PK on COMMANDE (
IDCOMMANDE
);

/*==============================================================*/
/* Index: COMMANDECLIENT_FK                                     */
/*==============================================================*/
create  index COMMANDECLIENT_FK on COMMANDE (
IDCLIENT
);

/*==============================================================*/
/* Table: MENU                                                  */
/*==============================================================*/
create table MENU (
   IDMENU               SERIAL               not null,
   NOMMENU              VARCHAR(75)          null,
   DATECREATIONMENU     DATE                 null,
   constraint PK_MENU primary key (IDMENU)
);

/*==============================================================*/
/* Index: MENU_PK                                               */
/*==============================================================*/
create unique index MENU_PK on MENU (
IDMENU
);

/*==============================================================*/
/* Table: MENUPRODUIT                                           */
/*==============================================================*/
create table MENUPRODUIT (
   IDMENU               INT4                 not null,
   IDPRODUIT            INT4                 not null,
   constraint PK_MENUPRODUIT primary key (IDMENU, IDPRODUIT)
);

/*==============================================================*/
/* Index: MENUPRODUIT_PK                                        */
/*==============================================================*/
create unique index MENUPRODUIT_PK on MENUPRODUIT (
IDMENU,
IDPRODUIT
);

/*==============================================================*/
/* Index: MENUPRODUIT_FK                                        */
/*==============================================================*/
create  index MENUPRODUIT_FK on MENUPRODUIT (
IDMENU
);

/*==============================================================*/
/* Index: MENUPRODUIT2_FK                                       */
/*==============================================================*/
create  index MENUPRODUIT2_FK on MENUPRODUIT (
IDPRODUIT
);

/*==============================================================*/
/* Table: PRIX                                                  */
/*==============================================================*/
create table PRIX (
   IDPRIX               SERIAL               not null,
   IDPRODUIT            INT4                 not null,
   MONTANT              NUMERIC              null,
   DATEPRIX             DATE                 null,
   constraint PK_PRIX primary key (IDPRIX)
);

/*==============================================================*/
/* Index: PRIX_PK                                               */
/*==============================================================*/
create unique index PRIX_PK on PRIX (
IDPRIX
);

/*==============================================================*/
/* Table: PRODUIT                                               */
/*==============================================================*/
create table PRODUIT (
   IDPRODUIT            SERIAL               not null,
   IDCATEGORIE          INT4                 not null,
   NOMPRODUIT           VARCHAR(50)          null,
   IMAGEPRODUIT         VARCHAR(50)          null,
   constraint PK_PRODUIT primary key (IDPRODUIT)
);

/*==============================================================*/
/* Index: PRODUIT_PK                                            */
/*==============================================================*/
create unique index PRODUIT_PK on PRODUIT (
IDPRODUIT
);

/*==============================================================*/
/* Index: CATPRODUIT_FK                                         */
/*==============================================================*/
create  index CATPRODUIT_FK on PRODUIT (
IDCATEGORIE
);

/*==============================================================*/
/* Table: PRODUITCOMMANDE                                       */
/*==============================================================*/
create table PRODUITCOMMANDE (
   IDPRODUIT            INT4                 not null,
   IDCOMMANDE           INT4                 not null,
   constraint PK_PRODUITCOMMANDE primary key (IDPRODUIT, IDCOMMANDE)
);

/*==============================================================*/
/* Index: PRODUITCOMMANDE_PK                                    */
/*==============================================================*/
create unique index PRODUITCOMMANDE_PK on PRODUITCOMMANDE (
IDPRODUIT,
IDCOMMANDE
);

/*==============================================================*/
/* Index: PRODUITCOMMANDE_FK                                    */
/*==============================================================*/
create  index PRODUITCOMMANDE_FK on PRODUITCOMMANDE (
IDPRODUIT
);

/*==============================================================*/
/* Index: PRODUITCOMMANDE2_FK                                   */
/*==============================================================*/
create  index PRODUITCOMMANDE2_FK on PRODUITCOMMANDE (
IDCOMMANDE
);

/*==============================================================*/
/* Table: SEXE                                                  */
/*==============================================================*/
create table SEXE (
   IDSEXE               SERIAL               not null,
   REFSEXE              CHAR(1)              null,
   NOMSEXE              VARCHAR(15)          null,
   constraint PK_SEXE primary key (IDSEXE)
);

/*==============================================================*/
/* Index: SEXE_PK                                               */
/*==============================================================*/
create unique index SEXE_PK on SEXE (
IDSEXE
);

alter table CLIENT
   add constraint FK_CLIENT_SEXCLIENT_SEXE foreign key (IDSEXE)
      references SEXE (IDSEXE)
      on delete restrict on update restrict;

alter table COMMANDE
   add constraint FK_COMMANDE_COMMANDEC_CLIENT foreign key (IDCLIENT)
      references CLIENT (IDCLIENT)
      on delete restrict on update restrict;

alter table MENUPRODUIT
   add constraint FK_MENUPROD_MENUPRODU_MENU foreign key (IDMENU)
      references MENU (IDMENU)
      on delete restrict on update restrict;

alter table MENUPRODUIT
   add constraint FK_MENUPROD_MENUPRODU_PRODUIT foreign key (IDPRODUIT)
      references PRODUIT (IDPRODUIT)
      on delete restrict on update restrict;

alter table PRIX
   add constraint FK_PRIX_PRIXPRODU_PRODUIT foreign key (IDPRODUIT)
      references PRODUIT (IDPRODUIT)
      on delete restrict on update restrict;

alter table PRODUIT
   add constraint FK_PRODUIT_CATPRODUI_CATEGORI foreign key (IDCATEGORIE)
      references CATEGORIE (IDCATEGORIE)
      on delete restrict on update restrict;

alter table PRODUITCOMMANDE
   add constraint FK_PRODUITC_PRODUITCO_PRODUIT foreign key (IDPRODUIT)
      references PRODUIT (IDPRODUIT)
      on delete restrict on update restrict;

alter table PRODUITCOMMANDE
   add constraint FK_PRODUITC_PRODUITCO_COMMANDE foreign key (IDCOMMANDE)
      references COMMANDE (IDCOMMANDE)
      on delete restrict on update restrict;

