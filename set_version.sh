#!/usr/bin/env sh

set -eu

NEW_VERSION=$1

mvn -f pom/pom.xml versions:set -DnewVersion=$NEW_VERSION -DgenerateBackupPoms=false
