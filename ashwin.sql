PGDMP         
                v            ashwin    9.5.13    9.5.13     X           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            Y           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            Z           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            [           1262    16385    ashwin    DATABASE     l   CREATE DATABASE ashwin WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_IN' LC_CTYPE = 'en_IN';
    DROP DATABASE ashwin;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            \           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    7            ]           0    0    SCHEMA public    ACL     �   REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;
                  postgres    false    7                        3079    12393    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            ^           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    2                        3079    16394 	   adminpack 	   EXTENSION     A   CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;
    DROP EXTENSION adminpack;
                  false            _           0    0    EXTENSION adminpack    COMMENT     M   COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';
                       false    1            �            1259    16386 	   employees    TABLE     z   CREATE TABLE public.employees (
    id integer NOT NULL,
    name text NOT NULL,
    age integer,
    designation text
);
    DROP TABLE public.employees;
       public         ashwin    false    7            U          0    16386 	   employees 
   TABLE DATA               ?   COPY public.employees (id, name, age, designation) FROM stdin;
    public       ashwin    false    182   �       �           2606    16393    employees_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.employees DROP CONSTRAINT employees_pkey;
       public         ashwin    false    182    182            U   ~   x�U�A�0���3�Yu��2�^*���e�1��v��^��	9�-��`���:F�d��{�\�.GY��C�x�5�nI�΅')�b��ǲr�0s�m���S��q���oU��"�l�7�     