## Questions you may ask

Q: How does the plugin work?

A: The plugin works by using packetevents to listen for packets that are sent to the server.

Q: How can the server-sided plugin crash the client?

A: This plugin sends an explosion packet with extremely high strength(Infinity) to the player client. Almost no computers can handle such huge explosion.

Q: Will this plugin lag my server?

A: No. This plugin is very lightweight and does not affect the server performance, also it listens to the packets asynchronously.

Q: Why do you use SQLite to store the ban list instead of YAML?

A: Performance. SQLite is a fast and lightweight database that is widely used in many projects. YAML is a human-readable data-serialization format, but when more and more players get banned, YAML storage method will lag the server.