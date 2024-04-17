CREATE TABLE tb_transaction (
                                id bigint NOT NULL PRIMARY KEY,
                                source_account_id bigint NOT NULL REFERENCES online_bank.account(id),
                                target_account_id bigint NOT NULL REFERENCES online_bank.account(id),
                                target_owner_name varchar(50) NOT NULL,
                                amount NUMERIC(10,3) NOT NULL,
                                initiation_date timestamp NOT NULL,
                                completion_date TIMESTAMP,
                                reference VARCHAR(255),
                                latitude REAL,
                                longitude REAL
);