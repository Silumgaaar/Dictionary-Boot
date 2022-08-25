CREATE SCHEMA IF NOT EXISTS y_cfg;

CREATE TABLE IF NOT EXISTS y_cfg.languages
(
    id         BIGSERIAL PRIMARY KEY,
    value      varchar(255),
    rule       varchar(255),
    created_on timestamp DEFAULT now(),
    updated_on timestamp DEFAULT now()
);

CREATE TABLE IF NOT EXISTS y_cfg.words
(
    id          BIGSERIAL PRIMARY KEY,
    value       varchar(255),
    language_id bigint NOT NULL,
    created_on  timestamp DEFAULT now(),
    updated_on  timestamp DEFAULT now()
);

CREATE TABLE IF NOT EXISTS y_cfg.translate
(
    id             BIGSERIAL PRIMARY KEY,
    source_word_id bigint NOT NULL,
    target_word_id bigint NOT NULL,
    created_on     timestamp DEFAULT now(),
    updated_on     timestamp DEFAULT now()
);