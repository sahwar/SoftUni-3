let storage = require('./storage');

storage.load().then(() => {
    console.log('first load');
    console.log(storage.getAll());
});
// storage.put('first','firstValue');
// storage.put('second','secondValue');
// storage.put('third','thirdValue');
// storage.put('fouth','fourthValue');
// console.log(storage.get('first'));
// console.log(storage.getAll());
// storage.delete('second');
// storage.update('first','updatedFirst');
// storage.save();
// storage.clear();
// storage.getAll();
// storage.load();
// console.log(storage.getAll());