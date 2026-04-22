# test-nebula

Тестовый проект — имитация `writerside-nebula`.

## Важно

Этот репо **не является самостоятельным root-проектом**.
Он подключается как subproject в `test-stardust`.

## Структура

```
test-stardust/    ← основной проект
test-nebula/      ← этот репо, подключается автоматически
```

## Запуск тестов

Тесты всегда запускаются из `test-stardust`:

```bash
cd test-stardust
./gradlew test
```

Это запустит тесты и stardust и nebula.
