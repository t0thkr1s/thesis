def test_valid_credentials(self):
    headers = {
        'Authorization': 'Basic %s' % b64encode("test:test").decode("ascii")
    }
    result = self.app.post('/login', headers=headers)
    self.assert200(result)
    data = json.loads(result.get_data(as_text=True))
    self.assertEqual(data['result'], 'Welcome, test!')