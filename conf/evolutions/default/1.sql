# --- !Ups

CREATE TABLE users (
  user_id CHARACTER VARYING NOT NULL PRIMARY KEY,
  first_name CHARACTER VARYING,
  last_name CHARACTER VARYING,
  full_name CHARACTER VARYING,
  email CHARACTER VARYING,
  avatar_url CHARACTER VARYING,
  activated BOOLEAN DEFAULT FALSE
);

CREATE TABLE auth_tokens (
  id CHARACTER VARYING PRIMARY KEY,
  user_id CHARACTER VARYING NOT NULL,
  expiry CHARACTER VARYING
);

CREATE TABLE login_info (
  id SERIAL PRIMARY KEY,
  provider_id CHARACTER VARYING NOT NULL,
  provider_key CHARACTER VARYING NOT NULL
);

CREATE TABLE user_login_info (
  user_id CHARACTER VARYING NOT NULL,
  login_info_id INTEGER NOT NULL
);

CREATE TABLE password_info (
  user_id CHARACTER VARYING NOT NULL,
  password CHARACTER VARYING NOT NULL,
  salt CHARACTER VARYING,
  login_info_id INTEGER NOT NULL
);

CREATE TABLE oauth1_info (
  id SERIAL PRIMARY KEY,
  token CHARACTER VARYING NOT NULL,
  secret CHARACTER VARYING NOT NULL,
  login_info_id INTEGER NOT NULL
);

CREATE TABLE oauth2_info (
  id SERIAL PRIMARY KEY,
  access_token CHARACTER VARYING NOT NULL,
  token_type CHARACTER VARYING,
  expires_in INTEGER,
  refresh_token CHARACTER VARYING,
  login_info_id INTEGER NOT NULL
);


# --- !Downs

DROP TABLE oauth2_info;
DROP TABLE oauth1_info;
DROP TABLE password_info;
DROP TABLE user_login_info;
DROP TABLE login_info;
DROP TABLE users;