TRUNCATE TABLE player RESTART IDENTITY CASCADE;
TRUNCATE TABLE team RESTART IDENTITY CASCADE;
TRUNCATE TABLE player_assigment RESTART IDENTITY CASCADE;
ALTER SEQUENCE player_seq RESTART WITH 1;
ALTER SEQUENCE team_seq RESTART WITH 1;
